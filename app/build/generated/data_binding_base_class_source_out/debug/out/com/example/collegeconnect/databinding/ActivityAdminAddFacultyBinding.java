// Generated by view binder compiler. Do not edit!
package com.example.collegeconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.collegeconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminAddFacultyBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText FID;

  @NonNull
  public final EditText address;

  @NonNull
  public final Spinner branch;

  @NonNull
  public final Button button2;

  @NonNull
  public final Spinner designation;

  @NonNull
  public final EditText email;

  @NonNull
  public final Spinner honorif;

  @NonNull
  public final EditText mobile;

  @NonNull
  public final EditText name;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView29;

  private ActivityAdminAddFacultyBinding(@NonNull ConstraintLayout rootView, @NonNull EditText FID,
      @NonNull EditText address, @NonNull Spinner branch, @NonNull Button button2,
      @NonNull Spinner designation, @NonNull EditText email, @NonNull Spinner honorif,
      @NonNull EditText mobile, @NonNull EditText name, @NonNull TextView textView10,
      @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView14,
      @NonNull TextView textView15, @NonNull TextView textView17, @NonNull TextView textView18,
      @NonNull TextView textView19, @NonNull TextView textView25, @NonNull TextView textView29) {
    this.rootView = rootView;
    this.FID = FID;
    this.address = address;
    this.branch = branch;
    this.button2 = button2;
    this.designation = designation;
    this.email = email;
    this.honorif = honorif;
    this.mobile = mobile;
    this.name = name;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView25 = textView25;
    this.textView29 = textView29;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminAddFacultyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminAddFacultyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_add_faculty, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminAddFacultyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.FID;
      EditText FID = rootView.findViewById(id);
      if (FID == null) {
        break missingId;
      }

      id = R.id.address;
      EditText address = rootView.findViewById(id);
      if (address == null) {
        break missingId;
      }

      id = R.id.branch;
      Spinner branch = rootView.findViewById(id);
      if (branch == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = rootView.findViewById(id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.designation;
      Spinner designation = rootView.findViewById(id);
      if (designation == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.honorif;
      Spinner honorif = rootView.findViewById(id);
      if (honorif == null) {
        break missingId;
      }

      id = R.id.mobile;
      EditText mobile = rootView.findViewById(id);
      if (mobile == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = rootView.findViewById(id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = rootView.findViewById(id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = rootView.findViewById(id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = rootView.findViewById(id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = rootView.findViewById(id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = rootView.findViewById(id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView29;
      TextView textView29 = rootView.findViewById(id);
      if (textView29 == null) {
        break missingId;
      }

      return new ActivityAdminAddFacultyBinding((ConstraintLayout) rootView, FID, address, branch,
          button2, designation, email, honorif, mobile, name, textView10, textView11, textView12,
          textView14, textView15, textView17, textView18, textView19, textView25, textView29);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
