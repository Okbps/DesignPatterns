package com.ch12Compound.djview;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Aspire on 03.06.2017.
 */
//@WebServlet("/djview.jsp")
public class DJViewServlet extends HttpServlet{
    public static final long serialVersionUID = 2L;

    @Override
    public void init() throws ServletException {
        BeatModel beatModel = new BeatModel();
        beatModel.initialize();
        getServletContext().setAttribute("beatModel", beatModel);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BeatModel beatModel = (BeatModel)getServletContext().getAttribute("beatModel");

        String bpm = req.getParameter("bpm");
        if(bpm==null){
            bpm = beatModel.getBPM() + "";
        }

        String set = req.getParameter("set");
        if(set!=null){
            int bpmNumber = 90;
            bpmNumber = Integer.parseInt(bpm);
            beatModel.setBPM(bpmNumber);
        }

        String decrease = req.getParameter("decrease");
        if(decrease!=null){
            beatModel.setBPM(beatModel.getBPM()-1);
        }

        String increase = req.getParameter("increase");
        if(increase!=null){
            beatModel.setBPM(beatModel.getBPM()+1);
        }

        String on = req.getParameter("on");
        if(on!=null){
            beatModel.on();
        }

        String off = req.getParameter("off");
        if(off!=null){
            beatModel.off();
        }

        req.setAttribute("beatModel", beatModel);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/djview.jsp");
        dispatcher.forward(req, resp);
    }
}
