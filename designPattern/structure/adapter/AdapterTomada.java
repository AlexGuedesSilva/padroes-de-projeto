package designPattern.structure.adapter;

public class AdapterTomada extends TomadaDeDoisPinos implements TomadaDeTresPinos {
    @Override
    public void conectar() {
        ligarDoisPinos(); // Adaptando o método existente ao esperado
    }
}

