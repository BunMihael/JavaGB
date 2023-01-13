package oopHW.HW2.FirstV;

import java.lang.reflect.Array;

public class Controller {
    public void startProgram() {
        String[] example = Container.example();
        Container container = new Container();
        View view = new View();
        while (true) {
            int start = View.showMenu();
            if (start == 1){
                String[] args = Container.example();
                view.printTree(container.getContainer(), view.familyAmount());
            }
            else if (start == 2) {
                container.setContainer(view.setParents(view.familyAmount()));
                System.out.print(container.getContainer());
            }
            else if (start == 3) {
                String[] x = container.getContainer();
                view.name();
                view.printNames(x);
                view.showParents(x);
            }

            else if (start == 4) {
                String[] x = container.getContainer();
                view.name();
                view.printNames(x);
                view.showChildren(x);
            }

            else if (start == 5) {
                Txt txt = new Txt();
                int choice = View.choiceTree();
                if (choice == 1) {
                    txt.saveTXT(example);
                }else {
                    txt.saveTXT(example);
                }
            }
            else if (start == 6) {
                view.printTree(example, view.familyAmount());
            }
            else if (start == 7) {
                System.out.println("See you later.");
                break;
            }

            else {
                System.out.println("Unknown choice.");
            }
        }
    
    }
    
}
