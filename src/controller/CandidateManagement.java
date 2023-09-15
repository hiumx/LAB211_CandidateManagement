
package controller;


import common.CandidateManagementSystem;
import common.Library;
import view.Menu;


public class CandidateManagement extends Menu<String> {

    static String[] mc = {"Experience", "Fresher", "Internship", "Searching", "Exit"};

    protected Library library;
    protected CandidateManagementSystem candiManSys;
    protected int[] array;
    protected int size_array;

    public CandidateManagement() {
        super("PROGRAMMING", mc);
        library = new Library();
        candiManSys = new CandidateManagementSystem();
    }

    @Override
    public void execute(int n) {
        String[] list = new String[]{"Create", "Update", "Delete", "Display"};
        switch (n) {
            case 1:
                Menu mnuExper = new Menu("Management Experience", list) {
                    @Override
                    public void execute(int n) {
                        switch (n) {
                            case 1:
                                candiManSys.create(n);
                                break;
                            case 2:
                                String candiIdUpdate = library.getString("Input candidate Id to update: ");
                                candiManSys.update(candiIdUpdate);
                                break;
                            case 3:
                                String candiIdDelete = library.getString("Input candidate Id to delete: ");
                                candiManSys.detele(candiIdDelete);
                                break;
                            case 4:
                                candiManSys.display();
                                break;
                            default:
                                break;
                        }

                    }
                };
                mnuExper.run();
                break;
            case 2:
                Menu mnuFresh = new Menu("Management Fresher", list) {
                    @Override
                    public void execute(int n) {
                        switch (n) {
                            case 1:
                                candiManSys.create(n);
                                break;
                            case 2:
                                String candiIdUpdate = library.getString("Input candidate Id to update: ");
                                candiManSys.update(candiIdUpdate);
                                break;
                            case 3:
                                String candiIdDelete = library.getString("Input candidate Id to delete: ");
                                candiManSys.detele(candiIdDelete);
                                break;
                            case 4:
                                candiManSys.display();
                                break;
                            default:
                                break;
                        }

                    }
                };
                mnuFresh.run();
                break;
            case 3:
                Menu mnuIntern = new Menu("Management Intership", list) {
                    @Override
                    public void execute(int n) {
                        switch (n) {
                            case 1:
                                candiManSys.create(n);
                                break;
                            case 2:
                                String candiIdUpdate = library.getString("Input candidate Id to update: ");
                                candiManSys.update(candiIdUpdate);
                                break;
                            case 3:
                                String candiIdDelete = library.getString("Input candidate Id to delete: ");
                                candiManSys.detele(candiIdDelete);
                                break;
                            case 4:
                                candiManSys.display();
                                break;
                            default:
                                break;
                        }

                    }
                };
                mnuIntern.run();
                break;
            case 4:
                String candiIdSearch = library.getString("Input candidate Id to search: ");
                if(candiManSys.search(candiIdSearch) == null) {
                    System.out.println("Not found!");
                } else {
                    System.out.println(candiManSys.search(candiIdSearch));
                }
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
