/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern.beans;

/**
 *
 * @author alexandre
 */
public class CreateBean {

    	private CreateBean() {

	}

    	private static class CreateBeanHolder {
	        private final static CreateBean instance = new CreateBean();
	}

        public static CreateBean getInstance() {
	        return CreateBeanHolder.instance;
        }
}
