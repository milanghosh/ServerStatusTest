
import java.io.*;
import java.net.*;
import java.io.*;
public class serverCheck {

        // Sends ping request to a provided IP address
        public static void sendPingRequest(String ipAddress)
                throws UnknownHostException, IOException
        {
            InetAddress geek = InetAddress.getByName(ipAddress);
            System.out.println("Sending Ping Request to " + ipAddress);
            if (geek.isReachable(5000))
                System.out.println("Host is reachable");
            else
                System.out.println("Sorry ! We can't reach to this host");
        }

        // Driver code
        public static void main(String[] args)
                throws UnknownHostException, IOException
        {
            String ipAddress = "127.0.0.1";
            sendPingRequest(ipAddress);

            ipAddress = "133.192.31.42";
            sendPingRequest(ipAddress);

            ipAddress = "145.154.42.58";
            sendPingRequest(ipAddress);
        }

    // Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Importing input output classes


        // main driver method
        public static void readFile(String[] args) throws Exception
        {

            File file = new File(
                    "C:\\Users\\milan\\Desktop\\Test.txt");

            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null)

                // Print the string
                System.out.println(st);
        }

}
