import java.awt.*;
import javax.swing.*;

public class J_PrintState extends JApplet
{
	public void init()
	{
		System.out.println("init: 初始化");
	}

	public void start()
	{
		System.out.println("start: 启动");
	}

	public void paint(Graphics g)
	{
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawString("验证小应用程序的生命周期",20,40);
		System.out.println("paint: 绘制");
	}

	public void stop()
	{
		System.out.println("stop: 停止");
	}

	public void destroy()
	{
		System.out.println("destroy: 关闭");
	}
}
