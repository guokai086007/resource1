import java.awt.*;
import javax.swing.*;

public class J_PrintState extends JApplet
{
	public void init()
	{
		System.out.println("init: ��ʼ��");
	}

	public void start()
	{
		System.out.println("start: ����");
	}

	public void paint(Graphics g)
	{
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawString("��֤СӦ�ó������������",20,40);
		System.out.println("paint: ����");
	}

	public void stop()
	{
		System.out.println("stop: ֹͣ");
	}

	public void destroy()
	{
		System.out.println("destroy: �ر�");
	}
}
