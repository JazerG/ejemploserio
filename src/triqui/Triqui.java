/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triqui;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jazer
 */
public class Triqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int jugada, puntos_player1 = 0, puntos_player2 = 0, rondas, diff_puntos, turno, dado1, dado2, jugada1 = 0, jugada2 = 0, puntos_doble_1 = 0, puntos_doble_2 = 0, num_obj, num_player, num_chek1, num_chek2, digit_chek1, digit_chek2, i, j, repetido, x = 1, fama, puntos, petalo_1 = 0, petalo_2 = 0, petalo_3 = 0, petalo_4 = 0, petalo_5 = 0, petalo_6 = 0, petalo_7 = 0, petalo_8 = 0, petalo_9 = 0;
        String opc_general, play, nom_player1, nom_player2, tirar, comenzar, continuar, segunda, sta_petalo_1 = "Con ficha", sta_petalo_2 = "Con ficha", sta_petalo_3 = "Con ficha", sta_petalo_4 = "Con ficha", sta_petalo_5 = "Con ficha", sta_petalo_6 = "Con ficha", sta_petalo_7 = "Con ficha", sta_petalo_8 = "Con ficha", sta_petalo_9 = "Con ficha";
        Random ran = new Random();

        JOptionPane.showMessageDialog(null, "!Bienvenido al centro de juegos!");

        do {

            opc_general = JOptionPane.showInputDialog(null, "************** Menú *************** \n"
                    + "1. Dados git push \n"
                    + "2. Punto y Fama \n"
                    + "3. La margaritia \n"
                    + "4. Salir \n"
                    + "************************************");
            opc_general = opc_general.toLowerCase();

            while (!opc_general.equals("1") && !opc_general.equals("2") && !opc_general.equals("3") && !opc_general.equals("4") && !opc_general.equals("5")) {
                JOptionPane.showMessageDialog(null, "Ha ingresado una opción invalida. Por favor intentelo nuevamente");
                opc_general = JOptionPane.showInputDialog(null, "************** Menú *************** \n"
                        + "1. Dados \n"
                        + "2. Punto y Fama \n"
                        + "3. La margaritia \n"
                        + "4. Salir \n"
                        + "************************************");
                opc_general = opc_general.toLowerCase();

            }

            if (opc_general.equals("1") || opc_general.equals("2") || opc_general.equals("3")) {
                switch (opc_general) {
                    case "1":
                        rondas = 0;
                        comenzar = JOptionPane.showInputDialog(null, "¡Vamos a jugar a los dados! ¿Están listos para comenzar (si/no) ?");
                        comenzar = comenzar.toLowerCase();
                        while (!comenzar.equals("si")) {
                            if (comenzar.equals("no")) {
                                comenzar = JOptionPane.showInputDialog(null, "Entiendo....en cuanto a esten listos podemos comenzar\n Ingrese si para empezar a jugar");
                                comenzar = comenzar.toLowerCase();
                            } else {
                                comenzar = JOptionPane.showInputDialog(null, "Ha ingresado una opción invalida. Porfavor intentelo nuevamente.\n¡Vamos a jugar a los dados! ¿Están listos para comenzar (si/no) ?");
                                comenzar = comenzar.toLowerCase();
                            }
                        }
                        do {
                            puntos_doble_1 = 0;
                            puntos_doble_2 = 0;
                            turno = 1;
                            JOptionPane.showMessageDialog(null, "Por el momento el marcador es el siguiente: \n---------------------------------------------------------------------------------------------"
                                    + "\nJugador 1: " + puntos_player1 + " puntos.             Jugador 2: " + puntos_player2 + " puntos.\nrondas jugadas: " + rondas + "\n---------------------------------------------------------------------------------------------");
                            JOptionPane.showMessageDialog(null, "Ahora es el turno del Jugador 1");
                            do {
                                tirar = JOptionPane.showInputDialog(null, "Jugador 1 ¿Estas listo para tirar los dados? Escriba Y para hacerlo.");
                                tirar = tirar.toLowerCase();
                                while (!tirar.equals("y")) {
                                    tirar = JOptionPane.showInputDialog(null, "Opción no valida....Presione Y para tirar los dados.");
                                    tirar = tirar.toLowerCase();
                                }

                                dado1 = ran.nextInt(6) + 1;
                                dado2 = ran.nextInt(6) + 1;

                                JOptionPane.showMessageDialog(null, "Obtuviste un " + dado1 + " y un " + dado2);

                                if (dado1 == dado2) {
                                    JOptionPane.showMessageDialog(null, "¡Un doble! Puedes volver a tirar los dados.");
                                    puntos_doble_1 = puntos_doble_1 + 1;
                                    turno = 1;
                                } else {
                                    jugada1 = dado1 + dado2;
                                    turno = 2;
                                    JOptionPane.showMessageDialog(null, "Ahora es el turno del Jugador 2");
                                }
                            } while (turno == 1);

                            do {
                                tirar = JOptionPane.showInputDialog(null, "Jugador 2 ¿Estas listo para tirar los dados? presione Y para hacerlo.");
                                tirar = tirar.toLowerCase();

                                while (!tirar.equals("y")) {
                                    tirar = JOptionPane.showInputDialog(null, "Opción no valida....Presione Y para tirar los dados..");
                                    tirar = tirar.toLowerCase();
                                }

                                dado1 = ran.nextInt(6) + 1;
                                dado2 = ran.nextInt(6) + 1;

                                JOptionPane.showMessageDialog(null, "Obtuviste un " + dado1 + " y un " + dado2);
                                if (dado1 == dado2) {
                                    JOptionPane.showMessageDialog(null, "¡Un doble! Puedes volver a tirar los dados.");
                                    puntos_doble_2 = puntos_doble_2 + 1;
                                    turno = 2;
                                } else {
                                    jugada2 = dado1 + dado2;
                                    turno = 3;
                                }

                            } while (turno == 2);

                            if (jugada2 == jugada1) {
                                JOptionPane.showMessageDialog(null, "¡Tenemos un....empate! Vamos a olvidarnos de esta ronda y jugemos de nuevo ¿vale?");
                                diff_puntos = 0;
                                puntos_doble_1 = 0;
                                puntos_doble_2 = 0;
                            } else {
                                if (jugada1 < jugada2) {
                                    JOptionPane.showMessageDialog(null, "!Esta ronda la gana el jugador 2!");
                                    puntos_player2 = puntos_player2 + 3;
                                } else {
                                    if (jugada1 > jugada2) {
                                        JOptionPane.showMessageDialog(null, "!Esta ronda la gana el jugador 1!");
                                        puntos_player1 = puntos_player1 + 3;
                                    }
                                }

                                puntos_player1 = puntos_player1 + puntos_doble_1;
                                puntos_player2 = puntos_player2 + puntos_doble_2;

                                diff_puntos = puntos_player1 - puntos_player2;
                                if (diff_puntos < 0) {
                                    diff_puntos = -1 * diff_puntos; // asegurar que la diferencias sea positiva (valor absoluto) 
                                }
                                rondas = rondas + 1;
                            }
                        } while (rondas <= 20 & diff_puntos < 15);

                        JOptionPane.showMessageDialog(null, "Al finalizar el juego, el marcador es el siguiente: \n---------------------------------------------------------------------------------------------"
                                + "\nJugador 1: " + puntos_player1 + " puntos.             Jugador 2: " + puntos_player2 + " puntos.\nrondas jugadas: " + rondas + "\n---------------------------------------------------------------------------------------------");

                        if (puntos_player1 < puntos_player2) {
                            JOptionPane.showMessageDialog(null, "!Gana el jugador 2!");
                        } else {
                            if (puntos_player1 > puntos_player2) {
                                JOptionPane.showMessageDialog(null, "!Gana el jugador 1!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Empate....¿Qué tal otra partida?");
                            }
                        }
                        break;

                    case "2":
                        rondas = 0;
                        comenzar = JOptionPane.showInputDialog(null, "¡Vamos a jugar a punto y fama! ¿Estás listo para comenzar (si/no) ?");
                        comenzar = comenzar.toLowerCase();
                        while (!comenzar.equals("si")) {
                            if (comenzar.equals("no")) {
                                comenzar = JOptionPane.showInputDialog(null, "Entiendo....en cuanto a esten listos podemos comenzar\n Ingrese si para empezar a jugar");
                                comenzar = comenzar.toLowerCase();
                            } else {
                                comenzar = JOptionPane.showInputDialog(null, "Ha ingresado una opción invalida. Por favor intentelo nuevamente.\n¡Vamos a jugar a punto y fama! ¿Estás listo para comenzar (si/no) ?");
                                comenzar = comenzar.toLowerCase();
                            }
                        }

                        do {
                            num_obj = ran.nextInt(8999) + 1000;
                            num_chek1 = num_obj;
                            repetido = 0;
                            for (i = 1; i <= 4; i++) {
                                digit_chek1 = num_chek1 % 10;
                                num_chek2 = num_chek1 / 10;
                                for (j = 1; j <= 4 - i; j++) {
                                    digit_chek2 = num_chek2 % 10;
                                    num_chek2 = num_chek2 / 10;
                                    if (digit_chek1 == digit_chek2) {
                                        repetido = repetido + 1;
                                    }
                                }
                                num_chek1 = num_chek1 / 10;
                            }
                            if (repetido >= 1) {
                                repetido = 1;
                            } else {
                                repetido = 0;
                            }
                        } while (repetido >= 1);

                        JOptionPane.showMessageDialog(null, "Listo, la pc ya tiene el número. Ahora intente adivinar cual es...");

                        do {
                            num_obj = ran.nextInt(8999) + 1000;
                            num_chek1 = num_obj;
                            repetido = 0;
                            for (i = 1; i <= 4; i++) {
                                digit_chek1 = num_chek1 % 10;
                                num_chek2 = num_chek1 / 10;
                                for (j = 1; j <= 4 - i; j++) {
                                    digit_chek2 = num_chek2 % 10;
                                    num_chek2 = num_chek2 / 10;
                                    if (digit_chek1 == digit_chek2) {
                                        repetido = repetido + 1;
                                    }
                                }
                                num_chek1 = num_chek1 / 10;
                            }
                            if (repetido >= 1) {
                                repetido = 1;
                            } else {
                                repetido = 0;
                            }
                        } while (repetido >= 1);

                        System.out.println("Listo, la pc ya tiene el número. Ahora intente adivinar cual es...");

                        do {
                            x = 1;
                            do {
                                if (rondas == 0) {
                                    if (x == 1) {
                                        num_player = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su número: "));
                                        while (num_player < 1000 || num_player > 9999) {
                                            num_player = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es invalido. Por favor digite un entero positivo de cuatro cifras..."));
                                        }
                                    } else {
                                        num_player = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado tiene cifras repetidas. Por favor intentelo nuevamente..."));
                                        while (num_player < 1000 || num_player > 9999) {
                                            num_player = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es invalido. Por favor digite un entero positivo de cuatro cifras..."));
                                        }
                                    }
                                } else {
                                    if (x == 1) {
                                        num_player = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su nuevo número: "));
                                        while (num_player < 1000 || num_player > 9999) {
                                            num_player = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es invalido. Por favor digite un entero positivo de cuatro cifras..."));
                                        }
                                    } else {
                                        num_player = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado tiene cifras repetidas. Por favor intentelo nuevamente..."));
                                        while (num_player < 1000 || num_player > 9999) {
                                            num_player = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es invalido. Por favor digite un entero positivo de cuatro cifras..."));
                                        }
                                    }
                                }

                                num_chek1 = num_player;
                                repetido = 0;
                                for (i = 1; i <= 4; i++) {
                                    digit_chek1 = num_chek1 % 10;
                                    num_chek2 = num_chek1 / 10;
                                    for (j = 1; j <= 4 - i; j++) {
                                        digit_chek2 = num_chek2 % 10;
                                        num_chek2 = num_chek2 / 10;
                                        if (digit_chek1 == digit_chek2) {
                                            repetido = repetido + 1;
                                        }
                                    }
                                    num_chek1 = num_chek1 / 10;
                                }
                                if (repetido >= 1) {
                                    repetido = 1;
                                } else {
                                    repetido = 0;
                                }
                                x = x + 1;
                            } while (repetido >= 1);

                            num_chek1 = num_player;

                            fama = 0;
                            puntos = 0;

                            for (i = 1; i <= 4; i++) {
                                digit_chek1 = num_chek1 % 10;
                                num_chek2 = num_obj;
                                for (j = 1; j <= 4; j++) {
                                    digit_chek2 = num_chek2 % 10;
                                    if (digit_chek1 == digit_chek2) {
                                        if (i == j) {
                                            fama = fama + 1;
                                        } else {
                                            puntos = puntos + 1;
                                        }
                                    }
                                    num_chek2 = num_chek2 / 10;
                                }
                                num_chek1 = num_chek1 / 10;
                            }

                            rondas = rondas + 1;

                            if (fama <= 3) {
                                JOptionPane.showMessageDialog(null, "Por el momento el marcador es el siguiente: \n---------------------------------------------------------------------------------------------"
                                        + "\nFamas: " + fama + "             Puntos: " + puntos + " puntos.\nrondas jugadas: " + rondas + "\n---------------------------------------------------------------------------------------------");
                            } else {
                                JOptionPane.showMessageDialog(null, "¡Lo has descubierto! El numero escojido por la PC era: " + num_obj + "\n"
                                        + "Te ha tomado: " + rondas + " intentos");
                            }
                        } while (num_obj != num_player);

                        break;

                    case "3":
                        rondas = 1;
                        comenzar = JOptionPane.showInputDialog(null, "¡Vamos a jugar a la margarita! ¿Están listos para comenzar (si/no) ?");
                        comenzar = comenzar.toLowerCase();

                        while (!comenzar.equals("si")) {
                            if (comenzar.equals("no")) {
                                comenzar = JOptionPane.showInputDialog(null, "Entiendo....en cuanto a esten listos podemos comenzar\nIngrese si para empezar a jugar");
                                comenzar = comenzar.toLowerCase();
                            } else {
                                comenzar = JOptionPane.showInputDialog(null, "Ha ingresado una opción invalida. Por favor intentelo nuevamente.\n¡Vamos a jugar a la margarita! ¿Están listos para comenzar (si/no) ?");
                                comenzar = comenzar.toLowerCase();
                            }
                        }

                        play = JOptionPane.showInputDialog(null, "Desea jugar como el jugador 1 (si/no) ?");
                        play = play.toLowerCase();

                        while (!play.equals("si") && !play.equals("no")) {
                            play = JOptionPane.showInputDialog(null, "Ha ingresado una opción invalida. Por favor intentelo nuevamente.\nDesea jugar como el jugador 1 (si/no) ?");
                            play = play.toLowerCase();
                        }
                        
                        if(play.equals("si")){
                            nom_player1 = JOptionPane.showInputDialog(null, "Por favor digite un nombre para jugar: ");
                            nom_player2 = JOptionPane.showInputDialog(null, "Jugador 2, por favor digite un nombre para jugar: ");
                        } else {
                            nom_player2 = JOptionPane.showInputDialog(null, "Por favor digite un nombre para jugar: ");
                            nom_player1= JOptionPane.showInputDialog(null, "Jugador 1, por favor digite un nombre para jugar: ");
                        }
                        

                        JOptionPane.showMessageDialog(null, "Por el momento el tablero es el siguiente: \n---------------------------------------------------------------------------------------------\n"
                                + "Petalo 1: " + sta_petalo_1 + "             Petalo 2: " + sta_petalo_2 + "\nPetalo 3: " + sta_petalo_3 + "             Petalo 4: " + sta_petalo_4 + "\nPetalo 5: " + sta_petalo_5 + "             Petalo 6: " + sta_petalo_6
                                + "\nPetalo 7: " + sta_petalo_7 + "             Petalo 8: " + sta_petalo_8 + "\nPetalo 9: " + sta_petalo_9 + "\n rondas jugadas: " + "0" + "\n---------------------------------------------------------------------------------------------");
                        do {
                            if (rondas % 2 == 0) {
                                jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "Es el turno de " + nom_player2 + " ¿Qué ficha desea retirar del tablero?"));
                            } else {
                                jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "Es el turno de " + nom_player1 + " ¿Qué ficha desea retirar del tablero?"));
                            }
                            while (jugada <= 0 || jugada > 9) {
                                jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida. Por favor intentelo de nuevo ingresando enteros entre 1 y 9."));
                            }

                            switch (jugada) {
                                case 1:
                                    if (!sta_petalo_1.equals("Con ficha")) {
                                        while (jugada == 1) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_1 = petalo_1 + 1;
                                    sta_petalo_1 = "Sin ficha";

                                    break;

                                case 2:
                                    if (!sta_petalo_2.equals("Con ficha")) {
                                        while (jugada == 2) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));

                                        }
                                    }

                                    petalo_2 = petalo_2 + 1;
                                    sta_petalo_2 = "Sin ficha";

                                    break;

                                case 3:
                                    if (!sta_petalo_3.equals("Con ficha")) {
                                        while (jugada == 3) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_3 = petalo_3 + 1;
                                    sta_petalo_3 = "Sin ficha";

                                    break;

                                case 4:
                                    if (!sta_petalo_4.equals("Con ficha")) {
                                        while (jugada == 4) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_4 = petalo_4 + 1;
                                    sta_petalo_4 = "Sin ficha";

                                    break;

                                case 5:
                                    if (!sta_petalo_5.equals("Con ficha")) {
                                        while (jugada == 5) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_5 = petalo_5 + 1;
                                    sta_petalo_5 = "Sin ficha";

                                    break;

                                case 6:
                                    if (!sta_petalo_6.equals("Con ficha")) {
                                        while (jugada == 6) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_6 = petalo_6 + 1;
                                    sta_petalo_6 = "Sin ficha";

                                    break;

                                case 7:
                                    if (!sta_petalo_7.equals("Con ficha")) {
                                        while (jugada == 7) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_7 = petalo_7 + 1;
                                    sta_petalo_7 = "Sin ficha";

                                    break;

                                case 8:
                                    if (!sta_petalo_8.equals("Con ficha")) {
                                        while (jugada == 8) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_8 = petalo_8 + 1;
                                    sta_petalo_8 = "Sin ficha";

                                    break;

                                case 9:
                                    if (!sta_petalo_9.equals("Con ficha")) {
                                        while (jugada == 9) {
                                            jugada = Integer.parseInt(JOptionPane.showInputDialog(null, "El petalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                        }
                                    }

                                    petalo_9 = petalo_9 + 1;
                                    sta_petalo_9 = "Sin ficha";

                                    break;
                            }

                            if (petalo_1 + petalo_2 + petalo_3 + petalo_4 + petalo_5 + petalo_6 + petalo_7 + petalo_8 + petalo_9 <= 8) {

                                segunda = JOptionPane.showInputDialog(null, "¿Desea retirar una segunda ficha del tablero (si/no)?");
                                segunda = segunda.toLowerCase();

                                while (!segunda.equals("si") && !segunda.equals("no")) {
                                    segunda = JOptionPane.showInputDialog(null, "Ha ingresado una opción invalida. Por favor intentelo nuevamente.\n¿Desea retirar una segunda ficha del tablero (si/no)?");
                                    segunda = segunda.toLowerCase();
                                }

                                if (segunda.equals("si")) {
                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué otra ficha desea retirar del tablero?"));
                                    switch (jugada2) {
                                        case 1:
                                            if (!sta_petalo_1.equals("Con ficha")) {
                                                while (jugada2 == 1) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 2:
                                            if (!sta_petalo_2.equals("Con ficha")) {
                                                while (jugada2 == 2) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 3:
                                            if (!sta_petalo_3.equals("Con ficha")) {
                                                while (jugada2 == 3) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 4:
                                            if (!sta_petalo_4.equals("Con ficha")) {
                                                while (jugada2 == 4) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 5:
                                            if (!sta_petalo_5.equals("Con ficha")) {
                                                while (jugada2 == 5) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 6:
                                            if (!sta_petalo_6.equals("Con ficha")) {
                                                while (jugada2 == 6) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 7:
                                            if (!sta_petalo_7.equals("Con ficha")) {
                                                while (jugada2 == 7) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 8:
                                            if (!sta_petalo_8.equals("Con ficha")) {
                                                while (jugada2 == 8) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;

                                        case 9:
                                            if (!sta_petalo_9.equals("Con ficha")) {
                                                while (jugada2 == 9) {
                                                    jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "El patalo que selecciono yo no tiene fichas. Por favor intentelo nuevamente."));
                                                }
                                            }

                                            break;
                                    }

                                    switch (jugada) {
                                        case 1:

                                            while (jugada2 != 4 && jugada2 != 2) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 4) {
                                                petalo_4 = petalo_4 + 1;
                                                sta_petalo_4 = "Sin ficha";
                                            } else {
                                                petalo_2 = petalo_2 + 1;
                                                sta_petalo_2 = "Sin ficha";
                                            }

                                            break;

                                        case 2:

                                            while (jugada2 != 1 & jugada2 != 3) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 1) {
                                                petalo_1 = petalo_1 + 1;
                                                sta_petalo_1 = "Sin ficha";
                                            } else {
                                                petalo_3 = petalo_3 + 1;
                                                sta_petalo_3 = "Sin ficha";
                                            }
                                            break;

                                        case 3:

                                            while (jugada2 != 2 & jugada2 != 5) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 2) {
                                                petalo_2 = petalo_2 + 1;
                                                sta_petalo_2 = "Sin ficha";
                                            } else {
                                                petalo_5 = petalo_5 + 1;
                                                sta_petalo_5 = "Sin ficha";
                                            }
                                            break;

                                        case 4:

                                            while (jugada2 != 1 & jugada2 != 6) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 1) {
                                                petalo_1 = petalo_1 + 1;
                                                sta_petalo_1 = "Sin ficha";
                                            } else {
                                                petalo_6 = petalo_6 + 1;
                                                sta_petalo_6 = "Sin ficha";
                                            }

                                            break;

                                        case 5:

                                            while (jugada2 != 3 & jugada2 != 7) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 3) {
                                                petalo_3 = petalo_3 + 1;
                                                sta_petalo_3 = "Sin ficha";
                                            } else {
                                                petalo_7 = petalo_7 + 1;
                                                sta_petalo_7 = "Sin ficha";
                                            }
                                            break;

                                        case 6:

                                            while (jugada2 != 4 & jugada2 != 8) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 4) {
                                                petalo_4 = petalo_4 + 1;
                                                sta_petalo_4 = "Sin ficha";
                                            } else {
                                                petalo_8 = petalo_8 + 1;
                                                sta_petalo_8 = "Sin ficha";
                                            }

                                            break;

                                        case 7:

                                            while (jugada2 != 5 & jugada2 != 9) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 5) {
                                                petalo_5 = petalo_5 + 1;
                                                sta_petalo_5 = "Sin ficha";
                                            } else {
                                                petalo_9 = petalo_9 + 1;
                                                sta_petalo_9 = "Sin ficha";
                                            }

                                            break;

                                        case 8:

                                            while (jugada2 != 6 & jugada2 != 9) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 6) {
                                                petalo_6 = petalo_6 + 1;
                                                sta_petalo_6 = "Sin ficha";
                                            } else {
                                                petalo_9 = petalo_9 + 1;
                                                sta_petalo_9 = "Sin ficha";
                                            }

                                            break;

                                        case 9:

                                            while (jugada2 != 7 & jugada2 != 8) {
                                                jugada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito una opción no valida, recuerdo que solo puede retirar una segunda ficha si esta en un petalo contiguo al que selecciono anteriormente."));
                                            }

                                            if (jugada2 == 7) {
                                                petalo_7 = petalo_7 + 1;
                                                sta_petalo_1 = "Sin ficha";
                                            } else {
                                                petalo_8 = petalo_8 + 1;
                                                sta_petalo_8 = "Sin ficha";
                                            }

                                            break;
                                    }
                                }
                            }

                            JOptionPane.showMessageDialog(null, "Por el momento el tablero es el siguiente: \n---------------------------------------------------------------------------------------------\n"
                                    + "Petalo 1: " + sta_petalo_1 + "             Petalo 2: " + sta_petalo_2 + "\nPetalo 3: " + sta_petalo_3 + "             Petalo 4: " + sta_petalo_4 + "\nPetalo 5: " + sta_petalo_5 + "             Petalo 6: " + sta_petalo_6
                                    + "\nPetalo 7: " + sta_petalo_7 + "             Petalo 8: " + sta_petalo_8 + "\nPetalo 9: " + sta_petalo_9 + "\n rondas jugadas: " + rondas + "\n---------------------------------------------------------------------------------------------");
                            rondas = rondas + 1;
                        } while (petalo_1 + petalo_2 + petalo_3 + petalo_4 + petalo_5 + petalo_6 + petalo_7 + petalo_8 + petalo_9 != 9);

                        if (rondas % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "! " + nom_player1 + " gana la partido! Se ha llevado la ultima ficha");
                        } else {
                            JOptionPane.showMessageDialog(null, "! " + nom_player2 + " gana la partido! Se ha llevado la ultima ficha");
                        }
                        break;

                }
                System.out.println();
                continuar = JOptionPane.showInputDialog("¿Desea volver al menú principal (si/no) ?");
                continuar = continuar.toLowerCase();

                while (!continuar.equals("si") && !continuar.equals("no")) {
                    JOptionPane.showMessageDialog(null, "Ha ingresado una opción invalida. Por favor intentelo nuevamente");
                    continuar = JOptionPane.showInputDialog("¿Desea volver al menú principal (si/no) ?");
                    continuar = continuar.toLowerCase();

                }

                if (continuar.equals("no")) {
                    opc_general = "4";
                }
            }

        } while (opc_general.equals("1") || opc_general.equals("2") || opc_general.equals("3"));
    }
}
