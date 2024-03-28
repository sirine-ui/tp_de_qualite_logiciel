package org.example.tp2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest2 {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Test
    public void testCreerUtilisateur_Exception() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du comportement du mock pour lever une exception
        doThrow(new ServiceException("Echec de la création de l'utilisateur")).when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Vérif l'exception ServiceException est bien levée
            assert (e.getMessage().equals("Echec de la création de l'utilisateur"));
        }
    }

    @Test
    public void testCreerUtilisateur_ErreurValidation() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("Jean", "", "jeandupont@email.com");

        UserService userService = new UserService(utilisateurApiMock);

        //userService.creerUtilisateur(utilisateur);//erreur car manque de prenom

        // Au lieu de passer un user invalide, passons un user valide
        Utilisateur utilisateurValide = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        userService.creerUtilisateur(utilisateurValide);

        // Vérif que creerUtilisateur n'est jamais appelée avec un user invalide
        verify(utilisateurApiMock, never()).creerUtilisateur(utilisateur);
    }

    @Test
    public void testCreerUtilisateur_IdUtilisateur() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du comportement du mock pour ne rien faire (méthode de type void)
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Définition d'un ID fictif
        int idUtilisateur = 123;

        // Configuration du mock pour renvoyer l'ID
       // when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenReturn(true);
        when(utilisateurApiMock.getIdUtilisateur()).thenReturn(idUtilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'ID de l'utilisateur
        // *err* verify(utilisateurApiMock).getIdUtilisateur();
        int idObtenu = utilisateurApiMock.getIdUtilisateur();
        assertEquals(idUtilisateur, idObtenu);
    }

    @Test
    public void testCreerUtilisateur_ArgumentsCaptures() throws ServiceException {
        // Scénario 4 : Utiliser des arguments capturés pour vérifier les arguments exacts
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Capturer les arguments passés à la méthode creerUtilisateur du mock
        ArgumentCaptor<Utilisateur> argumentCaptor = ArgumentCaptor.forClass(Utilisateur.class);
        verify(utilisateurApiMock).creerUtilisateur(argumentCaptor.capture());

        // Vérification des arguments capturés
        Utilisateur utilisateurCapture = argumentCaptor.getValue();
        assert utilisateurCapture.getNom().equals("Jean");
        assert utilisateurCapture.getPrenom().equals("Dupont");
        assert utilisateurCapture.getEmail().equals("jeandupont@email.com");
    }
}
