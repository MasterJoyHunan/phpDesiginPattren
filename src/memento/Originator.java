package memento;

/**
 * 发起人
 */
public class Originator {

    public String state;

    /**
     * 进行备份
     *
     * @return
     */
    public Memento createBackup() {
        return new Memento(state);
    }


    /**
     * 恢复备份
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
