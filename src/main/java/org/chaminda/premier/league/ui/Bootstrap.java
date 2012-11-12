/**
 * 
 */
package org.chaminda.premier.league.ui;

import org.chaminda.premier.league.service.IPremiershipService;
import org.chaminda.premier.league.service.PremiershipServiceImpl;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 2, 2012
 */
public class Bootstrap {

	public static void main(String args[]) {

		IPremiershipService iPremiershipService = new PremiershipServiceImpl();
		System.out.println("*****************************************");
		System.out.println("The premiership team with the smallest goal difference is - "
				+ iPremiershipService.getSmallestDiffBetweenForAndAgainst());
		System.out.println("*****************************************");
		

	}

}
