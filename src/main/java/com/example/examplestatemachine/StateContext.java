package com.example.examplestatemachine;

public class StateContext {

    private State accept;
    private State reject;
    private State curState;
    private Action firstAction;

    public StateContext() {
        this.accept = new AcceptState(this);
        this.reject = new RejectState(this);
        this.curState = this.reject;
        this.firstAction = Action.NULL;
    }

    public void actionA() {
        this.curState.actionA();
    }

    public Action getFirstAction() {
        return firstAction;
    }

    public void setFirstAction(Action firstAction) {
        this.firstAction = firstAction;
    }

    public void actionB() {
        this.curState.actionB();
    }

    public boolean isAccept() {
        return this.curState.isAccept();
    }

    public State getAccept() {
        return accept;
    }

    public void setAccept(State accept) {
        this.accept = accept;
    }

    public State getReject() {
        return reject;
    }

    public void setReject(State reject) {
        this.reject = reject;
    }

    public State getCurState() {
        return curState;
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }

}
