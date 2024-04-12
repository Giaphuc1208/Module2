package Student_manager;

public interface ManagerInterface<P> {
    void add (P num1);
    void delete (int num1);
    void edit (int num1, P num2);
    P[] findAll();
}
