package Exe.Ex4.geo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * This class represents a 2D polygon, as in https://en.wikipedia.org/wiki/Polygon
 * This polygon can be assumed to be simple in terms of area and contains.
 * 
 * You should update this class!
 * @author boaz.benmoshe
 *
 */
public class Polygon2D implements GeoShapeable{

	//data

	private LinkedList<Point2D> kodkod;

	//constractor

	public Polygon2D (LinkedList<Point2D> kodkod) {

		this.kodkod = new LinkedList<Point2D>();

		for (int i=0; i<kodkod.size(); i++) {
			this.kodkod.add(kodkod.get(i));
		}

	}

	//functions

	@Override
	public boolean contains(Point2D ot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {

		double ans = 0;

		if (kodkod==null || kodkod.size()==1) {return 0;}

		Point2D p1, p2;

		for (int i=0; i<kodkod.size()-1; i++) {
			p1 = new Point2D(kodkod.get(i));
			p2 = new Point2D(kodkod.get(i+1));
			double dist = p1.distance(p2);
			ans += dist;
		}

		p1 = kodkod.getFirst();
		p2 = kodkod.getLast();
		double dist = p1.distance(p2);
		ans += dist;

		return ans;
	}

	@Override
	public void move(Point2D vec) {
		// TODO Auto-generated method stub

	}

	@Override
	public GeoShapeable copy() {
		return new Polygon2D(this.kodkod);
	}

	@Override
	public void scale(Point2D center, double ratio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(Point2D center, double angleDegrees) {
		// TODO Auto-generated method stub

	}

	@Override
	public Point2D[] getPoints() {

		Point2D[] ans = new Point2D[this.kodkod.size()];

		for (int i=0; i<kodkod.size(); i++) {
			ans[i] = new Point2D(((LinkedList<Point2D>) this.kodkod).get(i));
		}

		return ans;
	}

}
