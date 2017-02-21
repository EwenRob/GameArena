public class Rectangle2
{
	public static void main(String[] args)
	{
		GameArena g = new GameArena(600,600);
		Rectangle b = new Rectangle(300, 300, 20, 20, "Green");
		
		g.addRectangle(b);
		int i = 300;
		int q = 300;
		while(true)
		{
			g.pause();
			
			if(g.upPressed()) {
				b.setYPosition(q);
				q--;
				if(q<=10) {
				b.setYPosition(10);
			}
			}
			if(g.downPressed()) {
				b.setYPosition(q);
				q++;
				if(q>=590) {
				b.setYPosition(590);
			}
			}
			if(g.leftPressed()) {
				b.setXPosition(i);
				i--;
				if(i<=10) {
				b.setXPosition(10);
			}
			}
			if(g.rightPressed()) {
				b.setXPosition(i);
				i++;
				if(i>=590) {
				b.setXPosition(590);
			}
			}
		}
	}
}