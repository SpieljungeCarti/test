import java.util.List;

abstract class MinMax implements MathematischeAusdrücke {

	private List<MathematischeAusdrücke> ausdrücke;

	public abstract double ausgabe();

	public abstract String ausgabeString();

}
