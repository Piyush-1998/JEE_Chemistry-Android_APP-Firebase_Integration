package com.pm161998.jeechemistry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import maes.tech.intentanim.CustomIntent;

/* loaded from: classes.dex */
public class Questions_view_pdf_opener extends AppCompatActivity {
    String[] ACName;
    String[] COMName;
    String[] CaliorimetryName;
    String[] CapacitanceName;
    List<String> ChildList;
    String[] CircularmotionName;
    String[] CurrentName;
    String[] EIName;
    String[] EWName;
    String[] ElectrostaticsName;
    String[] FMName;
    String[] FrictionName;
    String[] GOName;
    String[] GravitationName;
    String[] HTName;
    String[] KTGName;
    String[] MECName;
    String[] MPName;
    String[] MTName;
    String[] MeasurementName;
    String[] NLMName;
    String[] NPName;
    String[] PMName;
    String[] POCName;
    List<String> ParentList;
    Map<String, List<String>> ParentListItems;
    String[] RBDName;
    String[] RMName;
    String[] RelativeMName;
    String[] SHMName;
    String[] SSName;
    String[] STName;
    String[] SWName;
    String[] UDName;
    String[] WaveName;
    String[] defaultName;
    ExpandableListView expandableListView;

    public Questions_view_pdf_opener() {
        ArrayList arrayList = new ArrayList();
        this.ParentList = arrayList;
        arrayList.add("01-Chemical Arithmetic");
        this.ParentList.add("02-Atomic Structure");
        this.ParentList.add("03-Chemical Bonding");
        this.ParentList.add("04-Solutions");
        this.ParentList.add("05-Solid State");
        this.ParentList.add("06-Gaseous State");
        this.ParentList.add("07-Nuclear Chemistry");
        this.ParentList.add("08-Chemical Equilibrium");
        this.ParentList.add("09-ionic Equilibrium");
        this.ParentList.add("10-Thermodynamics & Thermochemistry");
        this.ParentList.add("11-Chemical Kinetics");
        this.ParentList.add("12-Electrochemistry");
        this.ParentList.add("13-Redox Reactions");
        this.ParentList.add("14-Surface Chemistry");
        this.ParentList.add("15-Chemical Periodicity");
        this.ParentList.add("16-General Principle of Extraction of Metal");
        this.ParentList.add("17-Hydrogen & its Compounds");
        this.ParentList.add("18-S & P Block Elements");
        this.ParentList.add("19-D & F Block Elements");
        this.ParentList.add("20-Coordination Chemistry");
        this.ParentList.add("21-Chemical Analysis");
        this.ParentList.add("22-Purification & Organic Compounds");
        this.ParentList.add("23-General Organic Compounds");
        this.ParentList.add("24-Hydrocarbons");
        this.ParentList.add("25-Halogen Containing Compounds");
        this.ParentList.add("26-Alcohal,Phenol & Ether");
        this.ParentList.add("27-Aldehydes & Ketones");
        this.ParentList.add("28-Carboxylix Acids & Their Derivatives");
        this.ParentList.add("29-Nitrogen Containing Compounds");
        this.ParentList.add("30-Polymers");
        this.ParentList.add("31-Biomolecules");
        this.ParentList.add("32-Chemistry in Action");
        this.ACName = new String[]{"1.1 Theory", "1.2 Simple_Exercise", "1.3 Detailed_Solutions", "1.4 Self_Evaluation-Test"};
        this.CaliorimetryName = new String[]{"2.1 Theory", "2.2 Simple_Exercise", "2.3 Detailed_Solutions", "2.4 Self_Evaluation-Test"};
        this.CapacitanceName = new String[]{"3.1 Theory", "3.2 Simple_Exercise", "3.3 Detailed_Solutions", "3.4 Self_Evaluation-Test"};
        this.COMName = new String[]{"4.1 Theory", "4.2 Simple_Exercise", "4.3 Detailed_Solutions", "4.4 Self_Evaluation-Test"};
        this.CircularmotionName = new String[]{"5.1 Theory", "5.2 Simple_Exercise", "5.3 Detailed_Solutions", "5.4 Self_Evaluation-Tests"};
        this.CurrentName = new String[]{"6.1 Theory", "6.2 Simple_Exercise", "6.3 Detailed_Solutions", "6.4 Self_Evaluation-Tests"};
        this.EIName = new String[]{"7.1 Theory", "7.2 Simple_Exercise", "7.3 Detailed_Solutions", "7.4 Self_Evaluation-Tests"};
        this.EWName = new String[]{"8.1 Theory", "8.2 Simple_Exercise", "8.3 Detailed_Solutions", "8.4 Self_Evaluation-Tests"};
        this.ElectrostaticsName = new String[]{"9.1 Theory", "9.2 Simple_Exercise", "9.3 Detailed_Solutions", "9.4 Self_Evaluation-Tests"};
        this.FMName = new String[]{"10.1 Theory", "10.2 Simple_Exercise", "10.3 Detailed_Solutions", "10.4 Self_Evaluation-Tests"};
        this.FrictionName = new String[]{"11.1 Theory", "11.2 Simple_Exercise", "11.3 Detailed_Solutions", "11.4 Self_Evaluation-Tests"};
        this.GOName = new String[]{"12.1 Theory", "12.2 Simple_Exercise", "12.3 Detailed_Solutions", "12.4 Self_Evaluation-Tests"};
        this.GravitationName = new String[]{"13.1 Theory", "13.2 Simple_Exercise", "13.3 Detailed_Solutions", "13.4 Self_Evaluation-Tests"};
        this.HTName = new String[]{"14.1 Theory", "14.2 Simple_Exercise", "14.3 Detailed_Solutions", "14.4 Self_Evaluation-Tests"};
        this.KTGName = new String[]{"15.1 Theory", "15.2 Simple_Exercise", "15.3 Detailed_Solutions", "15.4 Self_Evaluation-Tests"};
        this.MECName = new String[]{"16.1 Theory", "16.2 Simple_Exercise", "16.3 Detailed_Solutions", "16.4 Self_Evaluation-Tests"};
        this.MTName = new String[]{"17.1 Theory", "17.2 Simple_Exercise", "17.3 Detailed_Solutions", "17.4 Self_Evaluation-Tests"};
        this.MeasurementName = new String[]{"18.1 Theory - 1", "18.2 Theory - 2", "18.3 Theory - 3", "18.4 Theory - 4", "18.5 Simple_Exercise - 1", "18.6 Simple_Exercise - 2", "18.7 Simple_Exercise - 3", "18.8 Detailed_Solutions", "18.9 Self_Evaluation-Tests"};
        this.MPName = new String[]{"19.1 Theory", "19.2 Simple_Exercise-1", "19.3 Simple_Exercise-2", "19.4 Detailed_Solutions", "19.5 Self_Evaluation-Tests"};
        this.NLMName = new String[]{"20.1 Theory", "20.2 Simple_Exercise", "20.3 Detailed_Solutions", "20.4 Self_Evaluation-Tests"};
        this.NPName = new String[]{"21.1 Theory", "21.2 Simple_Exercise", "21.3 Detailed_Solutions", "21.4 Self_Evaluation-Tests"};
        this.POCName = new String[]{"22.1 Theory", "22.2 Simple_Exercise", "22.3 Detailed_Solutions", "22.4 Self_Evaluation-Tests"};
        this.PMName = new String[]{"23.1 Theory - 1", "23.2 Theory - 2", "23.3 Simple_Exercise", "23.4 Detailed_Solutions", "23.5 Self_Evaluation-Tests"};
        this.RMName = new String[]{"24.1 Theory", "24.2 Simple_Exercise", "24.3 Detailed_Solutions", "24.4 Self_Evaluation-Tests"};
        this.RelativeMName = new String[]{"25.1 Theory", "25.2 Simple_Exercise", "25.3 Detailed_Solutions", "25.4 Self_Evaluation-Tests"};
        this.RBDName = new String[]{"26.1 Theory", "26.2 Simple_Exercise", "26.3 Detailed_Solutions", "26.4 Self_Evaluation-Tests"};
        this.SHMName = new String[]{"27.1 Theory", "27.2 Simple_Exercise", "27.3 Detailed_Solutions", "27.4 Self_Evaluation-Tests"};
        this.SSName = new String[]{"28.1 Theory", "28.2 Simple_Exercise", "28.3 Detailed_Solutions", "28.4 Self_Evaluation-Tests"};
        this.SWName = new String[]{"29.1 Theory - 1", "29.2 Theory - 2", "29.3 Simple_Exercise", "29.4 Detailed_Solutions", "29.5 Self_Evaluation-Tests"};
        this.STName = new String[]{"30.1 Theory", "30.2 Simple_Exercise", "30.3 Detailed_Solutions", "30.4 Self_Evaluation-Tests"};
        this.UDName = new String[]{"31.1 Theory", "31.2 Simple_Exercise", "31.3 Detailed_Solutions", "31.4 Self_Evaluation-Tests"};
        this.WaveName = new String[]{"32.1 Theory", "32.2 Simple_Exercise", "32.3 Detailed_Solutions", "32.4 Self_Evaluation-Tests"};
        this.defaultName = new String[]{"Piyush Malviya"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_questions_view_pdf_opener);
        this.ParentListItems = new LinkedHashMap();
        for (String str : this.ParentList) {
            if (str.equals("01-Chemical Arithmetic")) {
                loadChild(this.ACName);
            } else if (str.equals("02-Atomic Structure")) {
                loadChild(this.CaliorimetryName);
            } else if (str.equals("03-Chemical Bonding")) {
                loadChild(this.CapacitanceName);
            } else if (str.equals("04-Solutions")) {
                loadChild(this.COMName);
            } else if (str.equals("05-Solid State")) {
                loadChild(this.CircularmotionName);
            } else if (str.equals("06-Gaseous State")) {
                loadChild(this.CurrentName);
            } else if (str.equals("07-Nuclear Chemistry")) {
                loadChild(this.EIName);
            } else if (str.equals("08-Chemical Equilibrium")) {
                loadChild(this.EWName);
            } else if (str.equals("09-ionic Equilibrium")) {
                loadChild(this.ElectrostaticsName);
            } else if (str.equals("10-Thermodynamics & Thermochemistry")) {
                loadChild(this.FMName);
            } else if (str.equals("11-Chemical Kinetics")) {
                loadChild(this.FrictionName);
            } else if (str.equals("12-Electrochemistry")) {
                loadChild(this.GOName);
            } else if (str.equals("13-Redox Reactions")) {
                loadChild(this.GravitationName);
            } else if (str.equals("14-Surface Chemistry")) {
                loadChild(this.HTName);
            } else if (str.equals("15-Chemical Periodicity")) {
                loadChild(this.KTGName);
            } else if (str.equals("16-General Principle of Extraction of Metal")) {
                loadChild(this.MECName);
            } else if (str.equals("17-Hydrogen & its Compounds")) {
                loadChild(this.MTName);
            } else if (str.equals("18-S & P Block Elements")) {
                loadChild(this.MeasurementName);
            } else if (str.equals("19-D & F Block Elements")) {
                loadChild(this.MPName);
            } else if (str.equals("20-Coordination Chemistry")) {
                loadChild(this.NLMName);
            } else if (str.equals("21-Chemical Analysis")) {
                loadChild(this.NPName);
            } else if (str.equals("22-Purification & Organic Compounds")) {
                loadChild(this.POCName);
            } else if (str.equals("23-General Organic Compounds")) {
                loadChild(this.PMName);
            } else if (str.equals("24-Hydrocarbons")) {
                loadChild(this.RMName);
            } else if (str.equals("25-Halogen Containing Compounds")) {
                loadChild(this.RelativeMName);
            } else if (str.equals("26-Alcohal,Phenol & Ether")) {
                loadChild(this.RBDName);
            } else if (str.equals("27-Aldehydes & Ketones")) {
                loadChild(this.SHMName);
            } else if (str.equals("28-Carboxylix Acids & Their Derivatives")) {
                loadChild(this.SSName);
            } else if (str.equals("29-Nitrogen Containing Compounds")) {
                loadChild(this.SWName);
            } else if (str.equals("30-Polymers")) {
                loadChild(this.STName);
            } else if (str.equals("31-Biomolecules")) {
                loadChild(this.UDName);
            } else if (str.equals("32-Chemistry in Action")) {
                loadChild(this.WaveName);
            } else {
                loadChild(this.defaultName);
            }
            this.ParentListItems.put(str, this.ChildList);
        }
        this.expandableListView = (ExpandableListView) findViewById(R.id.expandListView);
        final ListAdapter listAdapter = new ListAdapter(this, this.ParentList, this.ParentListItems);
        this.expandableListView.setAdapter(listAdapter);
        this.expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.pm161998.jeechemistry.Questions_view_pdf_opener.1
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                Intent intent = new Intent(Questions_view_pdf_opener.this.getApplicationContext(), Questions_pdf_opener.class);
                intent.putExtra("pdfFileName", (String) listAdapter.getChild(i, i2));
                Questions_view_pdf_opener.this.startActivity(intent);
                CustomIntent.customType(Questions_view_pdf_opener.this, "up-to-bottom");
                return true;
            }
        });
    }

    private void loadChild(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.ChildList = arrayList;
        Collections.addAll(arrayList, strArr);
    }
}
