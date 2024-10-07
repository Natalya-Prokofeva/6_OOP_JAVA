import model.FamilyTree;
import presenter.CommandHandler;
import presenter.TreePresenter;
import view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        ConsoleTreeView treeView = new ConsoleTreeView();

        TreePresenter presenter = new TreePresenter(treeView, treeView, familyTree);
        treeView.setPresenter(presenter);

        CommandHandler commandHandler = new CommandHandler(treeView, treeView, treeView, presenter);
        commandHandler.handleCommands();
    }
}
