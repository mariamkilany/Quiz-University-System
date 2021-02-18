import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClintSideStudent {
    public static void main(String[] args) {
        try {
            Socket clintSocket=new Socket("localhost",8989);
            DataOutputStream output=new DataOutputStream(clintSocket.getOutputStream());
            DataInputStream inputStream=new DataInputStream(clintSocket.getInputStream());
            //output.writeUTF("Hello World");
            String name;
            int id;
            int level;
            String subject;
            Scanner input=new Scanner(System.in);
            Scanner input1=new Scanner(System.in);
            double StudentNum;
            StudentNum=inputStream.readDouble();
            for (int i=0;i<StudentNum;i++) {
                System.out.println("|||Welcome Student|||");
                System.out.println("Enter Your name :");
                name = input1.nextLine();
                output.writeUTF(name);
                System.out.println("Enter your id :");
                id = input.nextInt();
                output.writeInt(id);
                System.out.println("Enter your level: ");
                level = input.nextInt();
                output.writeInt(level);
                System.out.println("Enter the subject code : \n" +
                        "-DataStructure (Cs214)\n" +
                        "-OperatingSystem (Cs341)\n" +
                        "-Object Oriented programming (Cs213)\n");
                subject = input1.nextLine();
                output.writeUTF(subject);
                String answer;
                for (int j = 0; j < 5; j++) {
                    System.out.println(inputStream.readUTF());
                    answer = input1.nextLine();
                    output.writeUTF(answer);
                }
                double score = inputStream.readDouble();
                System.out.println("Your Score=" + score);

            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
