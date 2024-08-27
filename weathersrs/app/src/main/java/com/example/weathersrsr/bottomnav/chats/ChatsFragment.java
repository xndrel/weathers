package com.example.wassup.bottomnav.chats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.wassup.chats.Chat;
import com.example.wassup.chats.ChatsAdapter;
import com.example.wassup.databinding.FragmentChatsBinding;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {
    private FragmentChatsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(inflater, container, false);

        loadChats();

        return binding.getRoot();
    }

    private void loadChats(){
        ArrayList<Chat> chats = new ArrayList<Chat>();
        chats.add(new Chat( "123","testChat", "1234567","12312312"));
        chats.add(new Chat( "123","testChat", "1234567","12312312"));
        chats.add(new Chat( "123","testChat", "1234567","12312312"));
        chats.add(new Chat( "123","testChat", "1234567","12312312"));

        binding.chatsRv.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.chatsRv.setAdapter(new ChatsAdapter(chats));
    }

}
