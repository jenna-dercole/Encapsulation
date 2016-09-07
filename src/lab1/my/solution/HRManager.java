/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author jdercole1
 */
public class HRManager {
        private Date currentDate;
        private boolean metWithHr;
        private boolean metDeptStaff;
        private boolean reviewedDeptPolicies;
        private boolean movedIn;
        private String cubeId;
                
        public void orientEmployee(Employee e) {
            this.meetWithHrForBenefitAndSalryInfo();
            this.meetDepartmentStaff();
            this.reviewDeptPolicies();
            this.moveIntoCubicle(cubeId);
            this.getStatus();
        }
        
        private String getStatus() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);

        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
        
        }
            
            // Assume this must be performed first
        private void meetWithHrForBenefitAndSalryInfo() {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Met with Hr on " + fmtDate);
            metWithHr = true;
        }

    // Assume this is must be performed second
        private void meetDepartmentStaff() {
            if(metWithHr) {
                SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
                String fmtDate = sdf.format(currentDate);
                System.out.println("Met with Dept. Staff on " + fmtDate);
                metDeptStaff = true;
            } else {
                System.out.println("Sorry, you cannot meet with "
                        + "department staff until you have met with HR.");
            }
        }

    // Assume this must be performed third
        private void reviewDeptPolicies() {
            if(metWithHr && metDeptStaff) {
                SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
                String fmtDate = sdf.format(currentDate);
                System.out.println("Reviewed Dept. Policies on " + fmtDate);
                reviewedDeptPolicies = true;
            } else {
                System.out.println("Sorry, you cannot review "
                + " department policies until you have first met with HR "
                + "and then with department staff.");
            }
        }

    // Assume this must be performed 4th
        private void moveIntoCubicle(String cubeId) {
            if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
                SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
                String fmtDate = sdf.format(currentDate);
                System.out.println("Moved into cube on " + fmtDate);
                this.cubeId = cubeId;
                this.movedIn = true;
            } else {
                System.out.println("Sorry, you cannot move in to a "
                        + "cubicle until you have first met with HR "
                        + "and then with department staff, and then reviewed"
                        + "department policies.");
            }

        }
}
