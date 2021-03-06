/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.ui;

import de.othr.heid.swheidflotankstelle.entity.Fuel;
import de.othr.heid.swheidflotankstelle.entity.FuelTank;
import de.othr.heid.swheidflotankstelle.entity.OilCompany;
import de.othr.heid.swheidflotankstelle.entity.PSOrder;
import de.othr.heid.swheidflotankstelle.service.CRMService;
import de.othr.heid.swheidflotankstelle.service.DeliveryService;
import de.othr.heid.swheidflotankstelle.service.FuelService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author Flo
 */
@WebServlet(name = "EntityTester", urlPatterns = {"/EntityTester"})
public class EntityTester extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Inject
    private FuelService fuelService;
    
    @Inject 
    private DeliveryService devService;
    
    @Inject
    private CRMService crmService;
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EntityTester</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EntityTester at " + request.getContextPath() + "</h1>");
           
            
            /*
            Fuel f1 = new Fuel("Super", 1.31);
            Fuel f2 = new Fuel("Super Plus", 1.38);
            Fuel f3 = new Fuel("Super E10", 1.29);
            Fuel f4 = new Fuel("LKW Diesel", 1.14);
            
            f1 = fuelService.addFuel(f1);
            f2 = fuelService.addFuel(f2);
            f3 = fuelService.addFuel(f3);
            f4 = fuelService.addFuel(f4);
            
            fuelService.changeFuelPrice(1, 1.14);
            */
            //Long temp = (Long)ThreadLocalRandom.current().nextLong(2000, 3000);
            fuelService.refuel(6l, 900.00);
            
            System.out.println("Bestellt ");

     
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
