package java_1;

import static java.awt.AWTEventMulticaster.add;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class tabla2 extends JFrame {

    JTable tabla = new JTable();
    JScrollPane pane = new JScrollPane();
    Object filas[][] = new Object[3][50];
    int x;
    JPanel P1 = new JPanel();

    private void tab() {
        setTitle("Mostrar tapa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 400);
        int x = 0;

        setVisible(true);
        P1.setLayout(null);
        P1.setBackground(Color.CYAN);
        add(P1);
        JTextField T1 = new JTextField();
        JTextField T2 = new JTextField();
        JTextField T3 = new JTextField();
        T1.setBounds(500, 250, 100, 300);
        T2.setBounds(400, 250, 205, 150);
        T3.setBounds(300, 300, 200, 250);
        P1.add(T3);
        P1.add(T2);
        P1.add(T1);

    }

    private void p() {
        String columnas[] = {"Nombre", "Apellido", "telefono"};
        Object filas[][] = {{"Erick", "Melendez", 625951}, {"Elmer", "Melendez", 625951},
        {"Erick", "Garcia", 625951}
        };

        tabla = new JTable(filas, columnas);

        pane = new JScrollPane(tabla);
        pane.setBounds(10, 20, 205, 200);
        P1.add(pane);
        pane.setVisible(true);
        JButton b1 = new JButton("imprimir");
        b1.setBounds(350, 20, 120, 50);
        P1.add(b1);
        ActionListener Imprimir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola mundo");
            }
        };

        b1.addActionListener(Imprimir);
    }

    private void Agregar(String nombre, String Apellido, int telefono) {
        if (x == 50) {
            System.out.println("Ya no se permiten mas numeros");

        } else {
            filas[x][0] = nombre;
            filas[x][1] = Apellido;
            filas[x][2] = telefono;
            x++;
        }

    }

    public void tabla() {
        tab();
        p();
       
    }

    public static void main(String[] args) {
        tabla2 nombre = new tabla2();
        nombre.tabla();
        
    }
}
