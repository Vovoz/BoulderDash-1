package view;

public class EventPerformer 
{

	private int keyUser;
	
	public int keyCodeToUser(int keyUser) 
	{
		// recupere code de la touche appuy�e 
		return keyUser;
	}

	public int getKeyUser() {
		return keyUser;
	}

	public void setKeyUser(int keyUser) {
		this.keyUser = keyUser;
	}

}