import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUser = 0;

        boolean evaluar = false;
        Cuenta cuenta = new Cuenta();

        while (!evaluar){
            System.out.println("****FEIBU****");
            System.out.println("""
                    LOGIN de FEIBU
                    1- Registrarse
                    2- Login
                    3- Salir
                    
                    Opcion: """);
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Creando cuenta de FEIBU");
                    System.out.print("Escriba su username: ");
                    String userCuenta = scanner.next();
                    System.out.print("Escriba su contraseña: ");
                    String userPassword = scanner.next();

                    cuenta.setUsername(userCuenta);
                    cuenta.setPassword(userPassword);
                break;
                case 2:
                    System.out.println("Creando cuenta de FEIBU");
                    System.out.print("Escriba su username: ");
                    String userLogin = scanner.next();
                    System.out.print("Escriba su contraseña: ");
                    String passwordLogin = scanner.next();

                    String Username = cuenta.getUsername();
                    String Password = cuenta.getPassword();
                    System.out.println(Username);
                    if (userLogin.equals(Username) && passwordLogin.equals(Password))                    {
                        System.out.println("Entraste");
                    }
                    else {
                        System.out.println("Incorrecto");
                    }
                break;
                case 3:
                    System.out.println("Adios");
                    evaluar = true;
                break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}