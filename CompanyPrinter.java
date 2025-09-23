import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "company-printer", mixinStandardHelpOptions = true, version = "1.0",
         description = "A personalized CLI that prints the company name.") // a simple description of what this program is about when the user do not use the correct command
public class CompanyPrinter implements Runnable {

    @Option(names = {"-c", "--company"}, description = "The company name to print", required = true)
    private String companyName; // allow user to choose their name

    @Option(names = {"-p", "--print-company"}, description = "Prints the company name")
    private boolean printCompany; 

    @Override
    public void run() {
        if (printCompany && companyName != null) {
            System.out.println("Hello " + companyName + "! This CLI was made for the job application");
        } else {
            CommandLine.usage(this, System.out);
        }
    }

    public static void main(String[] args) { // main function to run the code
        int exitCode = new CommandLine(new CompanyPrinter()).execute(args);
        System.exit(exitCode);
    }
}
