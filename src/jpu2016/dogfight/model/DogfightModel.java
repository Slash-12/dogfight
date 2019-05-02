package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel implements IDogfightModel
//extends Observable ??? aled je sais pas si on peut faire les deux en meme temps 
{
	public DogfightModel(){
		
	}
	@Override
	public IArea getArea(){
		return null ; // coucou les null
		
	}
	@Override
	public void buildArea(Dimension dimension){
		
	}
	@Override
	public void addMobile(IMobile Mobile){
		
	}
	@Override
	public void removeMobile(IMobile Mobile) {
		
		
	}
	@Override
	public ArrayList<IMobile> getMobiles() {
		
		return null; // que des null partout
	}
	@Override
	public IMobile getMobileByPlayer(int player) {
		
		return null; // j'ai dis des null partout partout ?
	}
	@Override
	public void setMobilesHavesMoved() {
		
		
	}
}
