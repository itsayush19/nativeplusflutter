import 'package:flutter/material.dart';

import 'cell_screen.dart';
import 'counter_screen.dart';
import 'flutter_activity_screen.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.indigo,
      ),
      initialRoute: '/',
      routes: {
        '/':(context)=>CounterScreen(),
        'flutter_activity':(context)=>FlutterActivityScreen(),
        'cell':(context)=>Cell()
      },
    );
  }
}