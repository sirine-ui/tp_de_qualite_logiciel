package org.example.tp2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        try {
            // Configuration du comportement du mock
            doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

            // Création du service avec le mock
            UserService userService = new UserService(utilisateurApiMock);

            // Appel de la méthode à tester
            userService.creerUtilisateur(utilisateur);

            // Vérification de l'appel à l'API
            verify(utilisateurApiMock, times(1)).creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Gestion de l'exception ServiceException si nécessaire
            fail("Exception ServiceException not expected");
        }
    }
}
