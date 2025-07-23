package designpattern.structure.decorator.decorator;

import designpattern.structure.decorator.component.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressed = /* lógica de compressão */ data;
        super.writeData(compressed);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return /* lógica de descompressão */ data;
    }
}
