package org.example;

import org.example.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class KafedraReport {
    
    public static void createReport() throws ClassNotFoundException, SQLException, JRException {
    
        Connection connection = ConnectionMSQLS.connectToDb();
        JasperDesign jdesign = JRXmlLoader.load("src\\main\\java\\org\\example\\ReportKafedra.jrxml");
        String queryReport = "SELECT SUM(dbo.Нагрузка_преподавателя_групповая.Объём_часов) AS 'Объём часов',\n" +
                "dbo.Нагрузка_преподавателя_групповая.Номер_группы,\n" +
                "dbo.Вид_занятий.Вид_занятий,\n" +
                "dbo.Дисциплина.Название_дисциплины,\n" +
                "dbo.Преподаватель.ФИО,\n" +
                "dbo.Должность.Название_должности,\n" +
                "YEAR(dbo.Семестр.Начало_учебного_года) AS 'Начало_учебного_года',\n" +
                "dbo.Семестр.Номер_семестра\n" +
                "FROM dbo.Нагрузка_преподавателя_групповая\n" +
                "INNER JOIN dbo.Вид_занятий ON dbo.Нагрузка_преподавателя_групповая.Код_вида_занятия = dbo.Вид_занятий.Код_вида_занятия\n" +
                "INNER JOIN dbo.Группа ON dbo.Нагрузка_преподавателя_групповая.Номер_группы = dbo.Группа.Номер_группы\n" +
                "INNER JOIN dbo.Дисциплина ON dbo.Нагрузка_преподавателя_групповая.Код_дисциплины = dbo.Дисциплина.Код_дисциплины\n" +
                "INNER JOIN dbo.Преподаватель ON dbo.Нагрузка_преподавателя_групповая.Код_преподавателя = dbo.Преподаватель.Код_преподавателя\n" +
                "INNER JOIN dbo.Должность ON dbo.Преподаватель.Код_должности = dbo.Должность.Код_должности\n" +
                "INNER JOIN dbo.Семестр ON dbo.Нагрузка_преподавателя_групповая.Код_семестра = dbo.Семестр.Код_семестра\n" +
                "GROUP BY dbo.Нагрузка_преподавателя_групповая.Номер_группы,\n" +
                "dbo.Вид_занятий.Вид_занятий,\n" +
                "dbo.Дисциплина.Название_дисциплины,\n" +
                "dbo.Преподаватель.ФИО,\n" +
                "dbo.Должность.Название_должности,\n" +
                "dbo.Семестр.Начало_учебного_года,\n" +
                "dbo.Семестр.Номер_семестра\n" +
                "ORDER BY 'Начало_учебного_года'";

        JRDesignQuery updateQuery = new JRDesignQuery();
        updateQuery.setText(queryReport);
        jdesign.setQuery(updateQuery);
        JasperReport jreport = JasperCompileManager.compileReport(jdesign);
        JasperPrint jprint = JasperFillManager.fillReport(jreport, null, connection);
        JasperExportManager.exportReportToHtmlFile(jprint, "F:\\KafedraReport2.html");
        JasperExportManager.exportReportToXmlFile(jprint, "F:\\KafedraReport3.xml", false);
    }   
}
