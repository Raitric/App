package com.example.scottto.game;

public abstract class Event{
private int timestamp;
abstract void Initialize();
abstract void Validate();
abstract void Execute();
        int GetTimestamp(){
        return timestamp;
        }
        void PutTimestamp(int input){
        timestamp=input;
        }
        }