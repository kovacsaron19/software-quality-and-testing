package aron.kovacs.g1098;

import aron.kovacs.g1098.adapter.TestAdapter;
import aron.kovacs.g1098.builder.TestBuilder;
import aron.kovacs.g1098.decorator.TestDecorator;
import aron.kovacs.g1098.facade.TestFacade;
import aron.kovacs.g1098.flyweight.TestFlyweight;
import aron.kovacs.g1098.prototype.TestPrototype;
import aron.kovacs.g1098.proxy.TestProxy;
import aron.kovacs.g1098.simplefactory.TestSimpleFactory;
import aron.kovacs.g1098.singleton.TestSingleton;

public class MainTestFacade {
		public static void runTests() throws CloneNotSupportedException {
			//creational
			System.out.println("----------Creational design patterns----------");
			System.out.println("----------Test singleton-----------------");
			TestSingleton.main(null);
			System.out.println("----------Test builder-----------------");
			TestBuilder.main(null);
			System.out.println("----------Test simpleFactory-----------------");
			TestSimpleFactory.main(null);
			System.out.println("----------Test prototype-----------------");
			TestPrototype.main(null);
			
			// structural
			System.out.println("----------Structural design patterns-------------");
			System.out.println("----------Test adapter-----------------");
			TestAdapter.main(null);
			System.out.println("----------Test decorator-----------------");
			TestDecorator.main(null);
			System.out.println("----------Test flyweight-----------------");
			TestFlyweight.main(null);
			System.out.println("----------Test proxy-----------------");
			TestProxy.main(null);
			System.out.println("----------Test facade-----------------");
			TestFacade.main(null);
		}
		
}
