package edu.wctc.MenuOut;

public abstract class Interactor {
    private MenuOptions menuOptions;
    private MenuContext context;
    private Mediator mediator;

    public Interactor(){
        menuOptions = new MenuOptions();
        context = new MenuContext();
        mediator = new Mediator();
    }

    public void start(){
        print(menuOptions);
        read(context, mediator);
    }

    abstract void print(MenuOptions menuOptions);
    abstract void read(MenuContext context, Mediator mediator);

    public void setContext(MenuContext context){
        this.context = context;
    }
}
