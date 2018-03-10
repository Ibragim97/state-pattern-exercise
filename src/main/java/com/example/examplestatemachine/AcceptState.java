package com.example.examplestatemachine;

public class AcceptState extends State {
    public AcceptState(StateContext stateContext) {
        this.sc = stateContext;
        this.accept = true;
    }

    public void actionA() {
        if(this.sc.getFirstAction() == Action.NULL)
            this.sc.setFirstAction(Action.A);
        if(this.sc.getFirstAction() == Action.A)
            this.sc.setCurState(sc.getAccept());
        else
            this.sc.setCurState(sc.getReject());
    }
    public void actionB() {
        if(this.sc.getFirstAction() == Action.NULL)
            this.sc.setFirstAction(Action.A);
        if(this.sc.getFirstAction() == Action.B)
            this.sc.setCurState(sc.getAccept());
        else
            this.sc.setCurState(sc.getReject());
    }

}
