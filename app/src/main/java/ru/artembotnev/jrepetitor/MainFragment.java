package ru.artembotnev.jrepetitor;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import ru.artembotnev.jrepetitor.databinding.FragmentMainBinding;

/**
 * Main fragment
 * <p>
 * Created by Artem Botnev 06.05.18
 */
public class MainFragment extends Fragment {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMainBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_main, container, false);

        binding.setFragment(this);

        return binding.getRoot();
    }

    /**
     * only for example
     */
    public void showTestToast(View view) {
        Toast.makeText(getActivity(), "Welcome to JRepetitor", Toast.LENGTH_SHORT).show();
    }
}
