package game.entities.player;

import game.InputHandler;
import game.entities.Bullet;
import game.entities.Entity;
import game.entities.Mob;
import game.gfx.Colours;
import game.gfx.Screen;
import game.level.Level;

public class Shoot extends Entity{

	private InputHandler input;

	public Shoot(Level level, int x, int y, InputHandler input) {
		super(level);
		this.input = input;
	}

	boolean shot = false;
	boolean hit = false;
    int direction;
    
	public Entity bullet;

    public void tick() {
        int xa = Player.xa;
		int ya = Player.ya;
		if (input.SUp.isPressed()){
			if(!hit){
			    direction=0;
			}
		}
		
		if (input.SDown.isPressed()) {
			if(!hit){
			    direction=2;
			}
		}
		
		if (input.SLeft.isPressed()) {
			if(!hit){
			    direction=3;
			}
		}
		
		if (input.SRight.isPressed()) {
			if(!hit){
			    direction=1;
			}
		}

		if ( input.SUp.isPressed() || input.SDown.isPressed() || input.SLeft.isPressed() || input.SRight.isPressed() ) {
			if(shot){
			    level.addEntity(bullet);
			    shot=true;
			}
		} else {
			shot = false;
		}
    }

	@Override
	public void render(Screen robot1Res) {
		// TODO Auto-generated method stub
		
	}

}