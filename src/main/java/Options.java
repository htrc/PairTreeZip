import com.beust.jcommander.Parameter;


public class Options {
    @Parameter(names = {"--pairtree-root", "-pr"}, description = "Root directory containing the pairtree.", required = true)
    public String pairTreeRoot;

    @Parameter(names = {"--volume-list", "-vl"}, description = "File containing the volume list.", required = true)
    public String volumeList;

    @Parameter(names = {"--destination-path", "-dp"}, description = "Output file location.", required = true)
    public String destinationPath;
}
