import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "company-printer", mixinStandardHelpOptions = true, version = "1.0",
         description = "A personalized CLI that prints the company name.") // a simple description of what this program is about when the user do not use the correct command
public class CompanyPrinter implements Runnable {

    @Option(names = {"-p", "--print-company"}, description = "Prints the company name") // i give the user a shorter and longer version of how to get the name of the company 
     
    private boolean printCompany; // checks if the user type in "-p" or "--print-company" as a command.

    private static String COMPANY_NAME = "Impact.com";  // Customized for Impact.com 

    @Override
    public void run() {
        if (printCompany) {
            System.out.println("Hello " + COMPANY_NAME + "! This CLI was made for the job application"); // if the user uses the correct command to print out the name, it will print out this string
        } else {
            CommandLine.usage(this, System.out); // if no then the system will print out --help list 
        }
    }

    public static void main(String[] args) { // main function to run the code
        int exitCode = new CommandLine(new CompanyPrinter()).execute(args);
        System.exit(exitCode);
    }
}