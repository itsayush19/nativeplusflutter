import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class FlutterActivityScreen extends StatefulWidget {
  const FlutterActivityScreen({Key? key}) : super(key: key);

  @override
  State<FlutterActivityScreen> createState() => _FlutterActivityScreenState();
}

class _FlutterActivityScreenState extends State<FlutterActivityScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter Activity'),
      ),
      body: SafeArea(
        child: Center(
          child: Text('Fluterrrrrrrrrr'),
        ),
      ),
    );
  }
}
