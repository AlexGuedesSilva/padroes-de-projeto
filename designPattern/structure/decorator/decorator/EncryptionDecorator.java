package designpattern.structure.decorator.decorator;

import designpattern.structure.decorator.component.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
	
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encrypted = /* lógica de encriptação */ data;
        super.writeData(encrypted);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return /* lógica de decriptação */ data;
    }
}

