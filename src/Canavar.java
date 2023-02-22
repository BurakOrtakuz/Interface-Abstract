public class Canavar implements IHareketYönetim{

    @Override
    public void ilerle() {
        System.out.println( " adım ileri gidildi");
    }

    @Override
    public void saldır() {
        System.out.println("Saldırı gerçekleşti.");
    }
}
