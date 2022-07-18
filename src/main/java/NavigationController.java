/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jason
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
    }
    
    public String moveToHelloPage() {
        return "hello";
    }
    
}
