public class Karakter implements IHareketYönetim{
    @Override
    public void saldır(){
        System.out.println("Saldırıldı!");
    }

    @Override
    public void ilerle() {
        System.out.println("İlerlendi");
    }
}
