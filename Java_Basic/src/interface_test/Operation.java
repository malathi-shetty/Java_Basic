package interface_test;

public interface Operation {

	default void addition() {
		System.out.println("default method addition");

	}
}