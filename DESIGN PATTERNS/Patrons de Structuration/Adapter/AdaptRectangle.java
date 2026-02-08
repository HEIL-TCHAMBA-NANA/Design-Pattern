class AdaptRectangle extends Rectangle implements Icar{

    public AdaptRectangle(float cote){
        super(cote, cote);
    }


    @Override
    public float perimetre(){
        return 4*super.getLongueur();
    }

    @Override
    public float aire(){
        return super.getLongueur()*super.getLongueur();
    }


}