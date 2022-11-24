public class Carrots {
    private int tor;
    private int mum;
    private int tCarrots;
    private int mCarrots;
    private int stock = 40;

    public Carrots(int tor, int mum) {
        this.tor = tor;
        this.mum = mum;
        calculateCarrots();
    }

    public void calculateCarrots(){
        for(int i = 0; stock != 0; i++){
            if(torEats(i)){
                tCarrots += 1;
                stock -= 1;
            }
            if(mumEats(i)){
                mCarrots += 1;
                stock -= 1;
            }
            if(stock == 1) {
                if (torEats(i+1) && mumEats(i+1)) {
                    stock -= 1;
                }
            }
        }
    }

    public boolean torEats(int i){
        return (i-1)%tor == 0;
    }

    public boolean mumEats(int i){
        return (i-1)%mum == 0;
    }

    public int gettCarrots() {
        return tCarrots;
    }

    public int getmCarrots() {
        return mCarrots;
    }

    @Override
    public String toString() {
        return "Carrots{" +
                "torTime=" + tor +
                ", mumTime=" + mum +
                ", tCarrots=" + tCarrots +
                ", mCarrots=" + mCarrots +
                '}';
    }
}
