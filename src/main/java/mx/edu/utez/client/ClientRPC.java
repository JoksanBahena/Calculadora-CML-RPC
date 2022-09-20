package mx.edu.utez.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClientRPC {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        String option = "", num1 = "", num2 = "";
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Exponente");
            System.out.println("6. Raiz");
            System.out.println("7. Historial de operaciones");
            System.out.println("8. Salir");

            option = scanner.next();

            if (isNumber(option)) {
                switch (Integer.parseInt(option)) {
                    case 1:
                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el primer valor");
                            num1 = scanner.next();

                            if (!isDouble(num1)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num1));

                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el segundo valor");
                            num2 = scanner.next();

                            if (!isDouble(num2)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num2));

                        Object[] suma = {Double.parseDouble(num1), Double.parseDouble(num2)};
                        Double resSuma = (Double)
                                client.execute("Methods.suma", suma);
                        System.out.println("--------------------------------------");
                        System.out.println(num1 + " + "+ num2 + " = " + resSuma);
                        System.out.println("--------------------------------------");

                        break;

                    case 2:
                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el primer valor");
                            num1 = scanner.next();

                            if (!isDouble(num1)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num1));

                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el segundo valor");
                            num2 = scanner.next();

                            if (!isDouble(num2)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num2));

                        Object[] resta = {Double.parseDouble(num1), Double.parseDouble(num2)};
                        Double resResta = (Double)
                                client.execute("Methods.resta", resta);
                        System.out.println("--------------------------------------");
                        System.out.println(num1 + " - "+ num2 + " = " + resResta);
                        System.out.println("--------------------------------------");

                        break;

                    case 3:
                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el primer valor");
                            num1 = scanner.next();


                            if (!isDouble(num1)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num1));

                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el segundo valor");
                            num2 = scanner.next();


                            if (!isDouble(num2)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num2));
                        Object[] multiplicacion = {Double.parseDouble(num1), Double.parseDouble(num2)};
                        Double resMultiplicacion = (Double)
                                client.execute("Methods.multiplicacion", multiplicacion);
                        System.out.println("--------------------------------------");
                        System.out.println(num1 + " x "+ num2 + " = " + resMultiplicacion);
                        System.out.println("--------------------------------------");

                        break;

                    case 4:
                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el primer valor");
                            num1 = scanner.next();
                            System.out.println("--------------------------------------");

                            if (!isDouble(num1)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num1));

                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el segundo valor");
                            num2 = scanner.next();

                            if (!isDouble(num2)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num2));

                        Object[] division = {Double.parseDouble(num1), Double.parseDouble(num2)};
                        Double resDivision = (Double)
                                client.execute("Methods.division", division);
                        System.out.println("--------------------------------------");
                        System.out.println(num1 + " / "+ num2 + " = " + resDivision);
                        System.out.println("--------------------------------------");

                        break;

                    case 5:
                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el primer valor");
                            num1 = scanner.next();

                            if (!isDouble(num1)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num1));

                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el segundo valor");
                            num2 = scanner.next();

                            if (!isDouble(num2)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num2));

                        Object[] exponente = {Double.parseDouble(num1), Double.parseDouble(num2)};
                        Double resExponente = (Double)
                                client.execute("Methods.exponente", exponente);
                        System.out.println("--------------------------------------");
                        System.out.println(num1 + " ^ "+ num2 + " = " + resExponente);
                        System.out.println("--------------------------------------");

                        break;

                    case 6:
                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el primer valor");
                            num1 = scanner.next();

                            if (!isDouble(num1)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num1));

                        do {
                            System.out.println("--------------------------------------");
                            System.out.println("Ingresa el segundo valor");
                            num2 = scanner.next();

                            if (!isDouble(num2)) {
                                System.out.println("Error! Ingrese un valor numerico");

                            }

                        }while (!isDouble(num2));

                        Object[] raiz = {Double.parseDouble(num1), Double.parseDouble(num2)};
                        Double resRaiz = (Double)
                                client.execute("Methods.raiz", raiz);
                        System.out.println("--------------------------------------");
                        System.out.println(num1 + " √ "+ num2 + " = " + resRaiz);
                        System.out.println("--------------------------------------");

                        break;

                    case 7:


                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            }else {
                System.out.println("Ingresa un valor valido");
            }

        }while (!option.equals("8"));

    }

    public static boolean isNumber (String number) {
        try {
            int num = Integer.parseInt(number);
            return true;

        }catch (NumberFormatException e) {
            return false;

        }
    }

    public static boolean isDouble (String number) {
        try {
            double num = Double.parseDouble(number);
            return true;

        }catch (NumberFormatException e) {
            return false;

        }
    }


}
