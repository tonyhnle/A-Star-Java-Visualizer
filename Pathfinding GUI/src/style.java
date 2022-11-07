import java.awt.Color;
import java.awt.Font;

/* Custom fonts and colors used in "Frame.java" class
 * by Tony Le
 */
public @interface style {
	Font bigText = new Font("arial", Font.BOLD, 24);
	Font REALBIGText = new Font("arial", Font.BOLD, 72);
	Font numbers = new Font("arial", Font.BOLD, 12);
	Font smallNumbers = new Font("arial", Font.PLAIN, 11);
	Color greenHighlight = new Color(51, 51, 102);
	Color redHighlight = new Color(51, 102, 102);
	Color blueHighlight = new Color(204, 255, 255);
	Color btnPanel = new Color(120, 120, 120, 80);
	Color darkText = new Color(48, 48, 48);
	Color lightText = new Color(232, 232, 232);
	Color startNode = new Color(0,0,153);
	Color endNode = new Color(153,0,0);
	Color hover = new Color(146,104,110);
}
