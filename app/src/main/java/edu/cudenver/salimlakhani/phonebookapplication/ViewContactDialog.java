package edu.cudenver.salimlakhani.phonebookapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import edu.cudenver.salimlakhani.phonebookapplication.databinding.DialogViewContactBinding;

public class ViewContactDialog extends DialogFragment {
    private DialogViewContactBinding binding;
    private Contact contact;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        binding = DialogViewContactBinding.inflate(LayoutInflater.from(getContext()));
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(binding.getRoot());

        binding.buttonMainMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dismiss ();
            }
        });

        binding.textViewName.setText(contact.getName());
        binding.textLabelPhone.setText(contact.getPhone());
        binding.textLabelEmail.setText(contact.getEmail());
        binding.textLabelStreet.setText(contact.getAddress());




        return builder.create();
    }

    public void setContact (Contact contact) {
        this.contact = contact;
    }
}
