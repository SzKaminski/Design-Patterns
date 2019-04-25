package decorator.schema;

public class NameDecorator implements BaseInterface{

    private BaseInterface actualVersion;

    public NameDecorator(BaseInterface actualVersion) {
        this.actualVersion = actualVersion;
    }

    @Override
    public String getName() {
        return actualVersion.getName() + " decorated!";
    }
}