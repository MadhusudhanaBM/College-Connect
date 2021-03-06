// Generated by view binder compiler. Do not edit!
package com.example.collegeconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.collegeconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFacultyProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView FID;

  @NonNull
  public final TextView address;

  @NonNull
  public final TextView branch;

  @NonNull
  public final Button button10;

  @NonNull
  public final TextView designation;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView mobile;

  @NonNull
  public final TextView name;

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
  public final TextView textView22;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView29;

  @NonNull
  public final TextView textView35;

  @NonNull
  public final Button updatebtn;

  @NonNull
  public final ImageView upphoto;

  private ActivityFacultyProfileBinding(@NonNull ConstraintLayout rootView, @NonNull TextView FID,
      @NonNull TextView address, @NonNull TextView branch, @NonNull Button button10,
      @NonNull TextView designation, @NonNull TextView email, @NonNull TextView mobile,
      @NonNull TextView name, @NonNull TextView textView10, @NonNull TextView textView11,
      @NonNull TextView textView12, @NonNull TextView textView14, @NonNull TextView textView15,
      @NonNull TextView textView22, @NonNull TextView textView24, @NonNull TextView textView25,
      @NonNull TextView textView29, @NonNull TextView textView35, @NonNull Button updatebtn,
      @NonNull ImageView upphoto) {
    this.rootView = rootView;
    this.FID = FID;
    this.address = address;
    this.branch = branch;
    this.button10 = button10;
    this.designation = designation;
    this.email = email;
    this.mobile = mobile;
    this.name = name;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView22 = textView22;
    this.textView24 = textView24;
    this.textView25 = textView25;
    this.textView29 = textView29;
    this.textView35 = textView35;
    this.updatebtn = updatebtn;
    this.upphoto = upphoto;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFacultyProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFacultyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_faculty_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFacultyProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.FID;
      TextView FID = rootView.findViewById(id);
      if (FID == null) {
        break missingId;
      }

      id = R.id.address;
      TextView address = rootView.findViewById(id);
      if (address == null) {
        break missingId;
      }

      id = R.id.branch;
      TextView branch = rootView.findViewById(id);
      if (branch == null) {
        break missingId;
      }

      id = R.id.button10;
      Button button10 = rootView.findViewById(id);
      if (button10 == null) {
        break missingId;
      }

      id = R.id.designation;
      TextView designation = rootView.findViewById(id);
      if (designation == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.mobile;
      TextView mobile = rootView.findViewById(id);
      if (mobile == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
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

      id = R.id.textView22;
      TextView textView22 = rootView.findViewById(id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = rootView.findViewById(id);
      if (textView24 == null) {
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

      id = R.id.textView35;
      TextView textView35 = rootView.findViewById(id);
      if (textView35 == null) {
        break missingId;
      }

      id = R.id.updatebtn;
      Button updatebtn = rootView.findViewById(id);
      if (updatebtn == null) {
        break missingId;
      }

      id = R.id.upphoto;
      ImageView upphoto = rootView.findViewById(id);
      if (upphoto == null) {
        break missingId;
      }

      return new ActivityFacultyProfileBinding((ConstraintLayout) rootView, FID, address, branch,
          button10, designation, email, mobile, name, textView10, textView11, textView12,
          textView14, textView15, textView22, textView24, textView25, textView29, textView35,
          updatebtn, upphoto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
