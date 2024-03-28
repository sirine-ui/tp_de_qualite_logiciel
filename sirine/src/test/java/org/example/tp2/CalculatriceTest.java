package org.example.tp2;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class CalculatriceTest {
    @Mock
    private Calculatrice calculatrice;
    @Test
    public void testAdditionner() {
        // Définition du comportement de la méthode "additionner"
        when(calculatrice.additionner(2, 3)).thenReturn(5);
        // TODO :Appel de la méthode à tester
        // Appel de la méthode additionner avec les arguments 2 et 3
        int resultat = calculatrice.additionner(2, 3);
        // TODO :Vérification du résultat
        assertEquals(5, resultat);
        // TODO :Vérification que la méthode "additionner" a été appelée avec les arguments 2 et 3
        verify(calculatrice).additionner(2, 3);
        // TODO :Vérification qu'aucune autre méthode n'a été appelée sur l'objet après l'appel de la méthode "additionner"
        verifyNoMoreInteractions(calculatrice);
        // TODO:Vérification de l'état de l'objet après l'appel de la méthode "additionner"
       // verify(calculatrice).getState();
    }
}
