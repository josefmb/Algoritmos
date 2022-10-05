import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilhaFila {
    LinkedList<String> m_aTarefas;

    Stack<String> m_stTarefas = new Stack<String>     ();
    Queue<String> m_sqTarefas = new LinkedList<String>();

    Scanner teclado = new Scanner(System.in);;

    private void insereTarefas() {
        m_aTarefas = new LinkedList<String>();
        Integer iContinuar = 0;

        do {
            System.out.println("Insira uma tarefa:");
            m_aTarefas.add(teclado.nextLine());

            System.out.println("Deseja continuar? (1 - Sim, 0 - Não)");
            iContinuar = Integer.parseInt(teclado.nextLine());
        } 
        while (iContinuar != 0);

        //teclado.close();
    }

    private void preenchePilha() {
        System.out.println("\nPilha:\n");
        insereTarefas();
        m_stTarefas.addAll(m_aTarefas);
    }

    private void preencheFila() {
        System.out.println("\nFila:\n");
        insereTarefas();
        m_sqTarefas.addAll(m_aTarefas);
    }

    public void apresentaPilha() {
        preenchePilha();
        String sTarefa = "";

        int iQtdTarefas = m_stTarefas.size();
        for (int idx = 1; idx <= iQtdTarefas; ++idx) {
            sTarefa = m_stTarefas.pop();
            System.out.println("Tarefa " + idx + ": " + sTarefa); 
        }
    }

    public void apresentaFila() {
        preencheFila();
        String sTarefa = "";

        int iQtdTarefas = m_sqTarefas.size();
        for (int idx = 1; idx <= iQtdTarefas; ++idx) {
            sTarefa = m_sqTarefas.poll();
            System.out.println("Tarefa " + idx + ": " + sTarefa); 
        }
    }
}
